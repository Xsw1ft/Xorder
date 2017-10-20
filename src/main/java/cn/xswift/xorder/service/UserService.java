package cn.xswift.xorder.service;

import java.util.List;

import cn.xswift.xorder.entity.Order;

public interface UserService {
	public boolean userRegist(String name,String pwd);
	public boolean userLogin(String name,String pwd);
	public boolean userOrder(String content);
	public List<Order> selectUserOrderAll();
	public List<Order> selectUserOrderAllFinished();
	public boolean finishOrder(int oid);
}
