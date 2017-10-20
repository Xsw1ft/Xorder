package cn.xswift.xorder.dao;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import cn.xswift.xorder.entity.Order;
import cn.xswift.xorder.entity.User;
import cn.xswift.xorder.inter.UserMapper;
import cn.xswift.xorder.mapper.Session;

@Repository
public class UserSession extends Session{
	
	public int insertUser(User user) throws IOException{
			
			int i = 0;
			SqlSession session = getSqlSessionFactory().openSession();
			try {
				UserMapper mapper = session.getMapper(UserMapper.class);
				i = mapper.insertUser(user);
				session.commit();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			finally{
				session.close();
			}
			return i;
	}

	public User selectUser(User user) throws IOException {
		SqlSession session = getSqlSessionFactory().openSession();
		User u = null;
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			u = mapper.selectUser(user);
		}
		catch(Exception e){
		}
		finally{
			session.close();
		}
		return u;
	}
	
	public int insertUserOrder(String content) throws IOException{
		String newContent = content.replaceAll("\n", "<br/>");
		int i = 0;
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			i = mapper.insertUserOrder(newContent,new Date().toString());
			session.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return i;
	}
	
	public List<Order> selectUserOrderAll() throws IOException {
		SqlSession session = getSqlSessionFactory().openSession();
		List<Order> list = null;
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			list = mapper.selectUserOrderAll();
		}
		catch(Exception e){
		}
		finally{
			session.close();
		}
		return list;
	}
	public List<Order> selectUserOrderAllFinished() throws IOException {
		SqlSession session = getSqlSessionFactory().openSession();
		List<Order> list = null;
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			list = mapper.selectUserOrderAllFinished();
		}
		catch(Exception e){
		}
		finally{
			session.close();
		}
		return list;
	}
	public int updateUserOrder(int oid) throws IOException {
		SqlSession session = getSqlSessionFactory().openSession();
		int i = 0;
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			i = mapper.updateUserOrder(oid,new Date().toString());
			session.commit();
		}
		catch(Exception e){
		}
		finally{
			session.close();
		}
		return i;
	}
}
