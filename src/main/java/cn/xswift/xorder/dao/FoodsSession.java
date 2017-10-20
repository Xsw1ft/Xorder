package cn.xswift.xorder.dao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import cn.xswift.xorder.entity.FoodsDetail;
import cn.xswift.xorder.inter.FoodsMapper;
import cn.xswift.xorder.mapper.Session;

@Repository
public class FoodsSession extends Session{
	
	/**
	 * 这个FoodsSession对表foods进行操作
	 * @return
	 * @throws IOException
	 */
	public List<FoodsDetail> selectFoodsDetailJC() throws IOException{
		
		SqlSession session = getSqlSessionFactory().openSession();
		List<FoodsDetail> fd = null;
		try {
			FoodsMapper mapper = session.getMapper(FoodsMapper.class);
			fd = mapper.selectFoodsDetail("c");}
		catch(Exception e){
			e.printStackTrace();}
		finally{
			session.close();}
		return fd;

	}
	
	public List<FoodsDetail> selectFoodsDetailZS() throws IOException{

		SqlSession session = getSqlSessionFactory().openSession();
		List<FoodsDetail> fd = null;
		try {
			FoodsMapper mapper = session.getMapper(FoodsMapper.class);
			fd = mapper.selectFoodsDetail("z");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return fd;

	}
	
	public List<FoodsDetail> selectFoodsDetailYL() throws IOException{

		SqlSession session = getSqlSessionFactory().openSession();
		List<FoodsDetail> fd = null;
		try {
			FoodsMapper mapper = session.getMapper(FoodsMapper.class);
			fd = mapper.selectFoodsDetail("y");

		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return fd;

	}
	
	public List<FoodsDetail> selectFoodsDetailAll() throws IOException{

		SqlSession session = getSqlSessionFactory().openSession();
		List<FoodsDetail> fd = null;
		try {
			FoodsMapper mapper = session.getMapper(FoodsMapper.class);
			fd = mapper.selectFoodsDetailAll();

		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return fd;

	}
	
	public int insertFood(FoodsDetail fi) throws IOException{
		
		int i = 0;
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			FoodsMapper mapper = session.getMapper(FoodsMapper.class);
			i = mapper.insertFoods(fi);
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
	public int updateFood(FoodsDetail fd) throws IOException{
			
			int i = 0;
			SqlSession session = getSqlSessionFactory().openSession();
			try {
				FoodsMapper mapper = session.getMapper(FoodsMapper.class);
				i = mapper.updateFoods(fd.getId(), fd.getName(), fd.getPrice(), fd.getKind());
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
	public int deleteFood(int fid) throws IOException{
			
			int i = 0;
			SqlSession session = getSqlSessionFactory().openSession();
			try {
				FoodsMapper mapper = session.getMapper(FoodsMapper.class);
				i = mapper.deleteFoods(fid);
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
	public FoodsDetail selectFoodsDetailOne(int fid) throws IOException{
		
		FoodsDetail fd = new FoodsDetail();
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			FoodsMapper mapper = session.getMapper(FoodsMapper.class);
			fd = mapper.selectFoodsDetailOne(fid);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return fd;
	}
}
