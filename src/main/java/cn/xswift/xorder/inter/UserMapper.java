package cn.xswift.xorder.inter;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.xswift.xorder.entity.Order;
import cn.xswift.xorder.entity.User;

public interface UserMapper {
	public int insertUser(User user);
	public int insertUserOrder(@Param("content") String content, @Param("starttime")String starttime); 
	public User selectUser(User user);
	public List<Order> selectUserOrderAll();
	public int updateUserOrder(@Param("oid") int oid,@Param("finishtime")String finishtime);
	public List<Order> selectUserOrderAllFinished();
}
