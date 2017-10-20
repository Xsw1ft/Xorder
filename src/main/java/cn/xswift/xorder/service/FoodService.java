package cn.xswift.xorder.service;

import java.util.List;

import cn.xswift.xorder.entity.FoodsDetail;

public interface FoodService {
	public int insertFood(FoodsDetail fd);
	public int updateFood(FoodsDetail fd);
	public int deleteFood(int fid);
	public List<FoodsDetail> selectFoodsDetailJC();
	public List<FoodsDetail> selectFoodsDetailZS();
	public List<FoodsDetail> selectFoodsDetailYL();
	public List<FoodsDetail> selectFoodsDetailALL();
	public FoodsDetail selectFoodsDetailOne(int fid);
}
