package cn.xswift.xorder.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xswift.xorder.dao.UserSession;
import cn.xswift.xorder.entity.Order;
import cn.xswift.xorder.entity.User;
import cn.xswift.xorder.service.UserService;

@Service(value="UserServiceImpl")
public class UserServiceImpl implements UserService{
	
	@Autowired() private UserSession us;
	
	public UserSession getUs() {
		return us;
	}

	public void setUs(UserSession us) {
		this.us = us;
	}

	public boolean userRegist(String name, String pwd) {
		User user = new User(name,pwd);
		boolean status = false;
		try {
			User oldU = us.selectUser(user);
			if(oldU!=null) {
				status = false;//用户名已存在，注册失败返回false
			}
			else if (us.insertUser(user)==1) {
					status =  true;//注册成功返回true
				}
				 else {
					status = false;//反之 false
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	public boolean userLogin(String name, String pwd) {
		User user = new User(name,pwd);
		boolean status =false;
		try {
			User u = us.selectUser(user);
			if(u==null) {
				status = false;//用户不存在 
			}
			else {
				if (u.getName().equals(name) && u.getPwd().equals(pwd)) {
					status =  true;//登陆成功返回true
				}
				else {
					status = false;//反之 false
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return status;
	}

	public boolean userOrder(String content) {
		boolean status = false;
		try {
			if(us.insertUserOrder(content)==1) {
				status = true;
			}else {
				status = false;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	public List<Order> selectUserOrderAll() {
		List<Order> list = null;
		try {
			list = us.selectUserOrderAll();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public List<Order> selectUserOrderAllFinished() {
		List<Order> list = null;
		try {
			list = us.selectUserOrderAllFinished();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public boolean finishOrder(int oid) {
		boolean status = false;
		try {
			if(us.updateUserOrder(oid)==1) {
				status = true;
			}else {
				status = false;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
}
