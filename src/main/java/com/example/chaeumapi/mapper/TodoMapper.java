package com.example.chaeumapi.mapper;

import com.example.chaeumapi.model.TodoProfile;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TodoMapper {

    @Select("SELECT * FROM Todo WHERE id=#{id}")
    List<TodoProfile> getTodo(@Param("id") String id);

    @Select("SELECT * FROM Todo")
    List<TodoProfile> getTodoList();

    @Insert("INSERT INTO Todo VALUES(#{id}, #{year}, #{month}, #{week}, #{text}, #{status}, #{feel})")
    int insertTodo(@Param("id") String id, @Param("year") String year,
                   @Param("month") String month, @Param("week") String week,
                   @Param("text") String text, @Param("status") int status, @Param("feel") int feel);

    @Update("UPDATE Todo SET text=#{req_text} WHERE id=#{id} AND year=#{year} AND month=#{month} AND week=#{week} AND text=#{res_text}")
    int updateTodo(
            @Param("id") String id, @Param("year") String year,
            @Param("month") String month, @Param("week") String week,
            @Param("req_text") String req_text, @Param("res_text") String res_text);

    @Update("UPDATE Todo SET status=#{status} WHERE id=#{id} AND year=#{year} AND month=#{month} AND week=#{week} AND text=#{res_text}")
    int updateStatus(
            @Param("id") String id, @Param("year") String year,
            @Param("month") String month, @Param("week") String week,
            @Param("res_text") String res_text, @Param("status") int status
    );

    @Delete("DELETE FROM Todo WHERE id=#{id} AND year=#{year} AND month=#{month} AND week=#{week} AND text=#{text}")
    int deleteTodo(@Param("id") String id, @Param("year") String year,
                   @Param("month") String month, @Param("week") String week,
                   @Param("text") String text);

}
