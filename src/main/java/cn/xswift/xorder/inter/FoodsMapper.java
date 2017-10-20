package cn.xswift.xorder.inter;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.xswift.xorder.entity.FoodsDetail;

public interface FoodsMapper {
	public List<FoodsDetail> selectFoodsDetail(String kind);
	public List<FoodsDetail> selectFoodsDetailAll();
	public int insertFoods(FoodsDetail fi);
	public int deleteFoods(int fid);
	public FoodsDetail selectFoodsDetailOne(int fid);
	public int updateFoods(@Param("fid") int fid,@Param("fname") String fname,@Param("fprice") double fprice,@Param("fkind") String fkind);
}
