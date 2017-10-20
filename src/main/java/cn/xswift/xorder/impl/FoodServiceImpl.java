package cn.xswift.xorder.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xswift.xorder.dao.FoodsSession;
import cn.xswift.xorder.entity.FoodsDetail;
import cn.xswift.xorder.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService{

	@Autowired() private FoodsSession fs;
	
	public FoodsSession getFs() {
		return fs;
	}

	public void setFs(FoodsSession fs) {
		this.fs = fs;
	}

	public int insertFood(FoodsDetail fd) {
		int influ=0;
		try {
			influ = fs.insertFood(fd);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return influ;
	}

	public List<FoodsDetail> selectFoodsDetailJC() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<FoodsDetail> selectFoodsDetailZS() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<FoodsDetail> selectFoodsDetailYL() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<FoodsDetail> selectFoodsDetailALL() {
		List<FoodsDetail> fd=null;
		try {
			fd = fs.selectFoodsDetailAll();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fd;
	}

	public int deleteFood(int fid) {
		int influ = 0;
		try {
			influ = fs.deleteFood(fid);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return influ;
	}

	public FoodsDetail selectFoodsDetailOne(int fid) {
		FoodsDetail fd = new FoodsDetail();
		try {
			fd = fs.selectFoodsDetailOne(fid);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fd;
	}

	public int updateFood(FoodsDetail fd) {
		int influ=0;
		try {
			influ = fs.updateFood(fd);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return influ;
	}
	

}
