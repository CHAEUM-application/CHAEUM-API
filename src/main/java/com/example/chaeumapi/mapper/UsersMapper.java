package com.example.chaeumapi.mapper;

import com.example.chaeumapi.model.UsersProfile;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.*;


import java.sql.Date;
import java.util.List;


@Mapper
public interface UsersMapper {

    @Select("SELECT * FROM Users WHERE c_id=#{c_id}")
    UsersProfile getUsers(@Param("c_id") String c_id);

    @Select("SELECT * FROM Users")
    List<UsersProfile> getUsersList();

    @Insert("INSERT INTO Users VALUES(#{c_name}, #{c_id}, #{c_pw}, #{c_date})")
    int insertUsers(@Param("c_name") String c_name, @Param("c_id") String c_id,
                    @Param("c_pw") String c_pw, @Param("c_date") Date c_date);

    @Update("UPDATE Users SET c_name=#{c_name}, c_pw=#{c_pw}, c_date=#{c_date} WHERE c_id=#{c_id}")
    int updateUsers(@Param("c_name") String c_name, @Param("c_id") String c_id,
                    @Param("c_pw") String c_pw, @Param("c_date") Date c_date);

    @Delete("DELETE FROM Users WHERE c_id=#{c_id}")
    int deleteUsers(@Param("c_id") String c_id);

}
