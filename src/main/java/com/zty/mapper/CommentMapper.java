package com.zty.mapper;

import com.zty.domain.Comment;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CommentMapper {

    //查询方法
    @Select("SELECT * FROM t_comment WHERE id =#{id}")
    public Comment findById(Integer id);


    //插入方法
    @Insert("INSERT INTO t_comment(content,author,a_id) " + "values (#{content},#{author},#{aId})")
    public int insertComment(Comment comment);
    //修改方法
    @Update("UPDATE t_comment SET content=#{content} WHERE id=#{id}")
    public int updateComment(Comment comment);

    //查询方法
    @Delete("DELETE FROM t_comment WHERE id=#{id}")
    public int deleteComment(Integer id);


}


