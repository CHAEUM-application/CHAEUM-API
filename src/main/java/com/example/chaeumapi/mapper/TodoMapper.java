package com.example.chaeumapi.mapper;

import com.example.chaeumapi.model.TodoProfile;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TodoMapper {

    @Select("SELECT * FROM Todo WHERE id=#{id}")
    TodoProfile getTodo(@Param("id") String id);

    @Select("SELECT * FROM Todo")
    List<TodoProfile> getTodoList();

    @Insert("INSERT INTO Todo VALUES(#{id}, #{year}, #{month}, #{week}, #{text}, #{status})")
    int insertTodo(@Param("id") String id, @Param("year") String year,
                   @Param("month") String month, @Param("week") String week,
                   @Param("text") String text, @Param("status") int status);

    @Update("UPDATE Todo SET text=#{text} WHERE id=#{id} AND year=#{year} AND month=#{month} AND week=#{week}")
    int updateTodo(
            @Param("id") String id, @Param("year") String year,
            @Param("month") String month, @Param("week") String week,
            @Param("text") String text);

    @Delete("DELETE FROM Todo WHERE id=#{id} AND year=#{year} AND month=#{month} AND week=#{week} AND text=#{text}")
    int deleteTodo(@Param("id") String id, @Param("year") String year,
                   @Param("month") String month, @Param("week") String week,
                   @Param("text") String text);

}
