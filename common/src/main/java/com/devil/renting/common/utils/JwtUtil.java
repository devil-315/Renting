package com.devil.renting.common.utils;

import com.devil.renting.common.exception.LeaseException;
import com.devil.renting.common.result.ResultCodeEnum;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.util.Date;

/**
 * ClassName：JwtUtil
 *
 * @author: Devil
 * @Date: 2025/2/3
 * @Description:
 * @version: 1.0
 */
public class JwtUtil {

    private static long tokenExpiration = 60 * 60 * 1000L;
    private static SecretKey secretKey = Keys.hmacShaKeyFor("M0PKKI6pYGVWWfDZw90a0lTpGYX1d4AQ".getBytes());

    public static String createToken(Long userId, String username) {
        String token = Jwts.builder().
                setSubject("USER_INFO").
                setExpiration(new Date(System.currentTimeMillis() + tokenExpiration)).
                claim("userId", userId).
                claim("username", username).
                signWith(secretKey, SignatureAlgorithm.HS256).
                compact();
        return token;
    }
    public static Claims parseToken(String token){

        if (token==null){
            throw new LeaseException(ResultCodeEnum.ADMIN_LOGIN_AUTH);
        }

        try{
            //创建了一个JwtParser实例，并设置了签名密钥secretKey
            JwtParser jwtParser = Jwts.parserBuilder().setSigningKey(secretKey).build();
            return jwtParser.parseClaimsJws(token).getBody();//来解析token并获取其中的声明(Claims)
        }catch (ExpiredJwtException e){
            throw new LeaseException(ResultCodeEnum.TOKEN_EXPIRED);//token已过期
        }catch (JwtException e){
            throw new LeaseException(ResultCodeEnum.TOKEN_INVALID);//捕获所有其他与JWT相关的异常
        }
    }

    public static void main(String[] args) {
        System.out.println(createToken(8L,"19516512506"));
    }
}
