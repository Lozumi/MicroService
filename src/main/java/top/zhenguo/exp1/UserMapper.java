package top.zhenguo.exp1;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface UserMapper{
    @Select("select * from tb_user")
    List<User> getAllUsers();

    @Delete("DELETE FROM tb_user WHERE id = #{id}")
    void delete(Integer id);
}