package cn.xswift.xorder.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.xswift.xorder.entity.FoodsDetail;
import cn.xswift.xorder.impl.FoodServiceImpl;


@Controller
public class FoodsController {
	
	private FoodServiceImpl fsi;
	private FoodsDetail fd;
	
	
	public FoodsDetail getFd() {
		return fd;
	}

	public void setFd(FoodsDetail fd) {
		this.fd = fd;
	}

	public FoodServiceImpl getFsi() {
		return fsi;
	}

	public void setFsi(FoodServiceImpl fsi) {
		this.fsi = fsi;
	}

	@RequestMapping(value="/checkPutOnSale")
	public ModelAndView checkPutOnSale(
			@RequestParam(value="name",required=false) String name,
			@RequestParam(value="price",required=false) Double price,
			@RequestParam(value="kind",required=false) String kind
			) {
		ModelAndView mv= new ModelAndView();
		fd = new FoodsDetail(name, price, kind);
		if(fsi.insertFood(fd)==1) {
			mv.setViewName("successfulPutOnSale");
		}else {
			mv.setViewName("putOnSale");
		}
		return mv;
	}

	@RequestMapping(value="/pullOffShelves")
	public ModelAndView goPullOffShelves() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("f", fsi.selectFoodsDetailALL());
		mv.setViewName("pullOffShelves");
		return mv;
	}
	@RequestMapping(value="/doPullOffShelves")
	public ModelAndView doPullOffShelves(
			@RequestParam(value="fid",required=false) String fid
			) {
		ModelAndView mv = new ModelAndView();
		if(fsi.deleteFood(Integer.parseInt(fid))==1) {
			mv.setViewName("successfulPullOfShelves");
		}
		else {
			mv.setViewName("pullOfShelves");
		}
		return mv;
	}
	@RequestMapping(value="/editFood")
	public ModelAndView editFood(
			@RequestParam(value="fid",required=false) String fid
			) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("editFood");
		mv.addObject("f", fsi.selectFoodsDetailOne(Integer.parseInt(fid)));
		return mv;
	}
	@RequestMapping(value="/checkEditFood")
	public ModelAndView checkEditFood(
			@RequestParam(value="id",required=false) String id,
			@RequestParam(value="name",required=false) String name,
			@RequestParam(value="price",required=false) String price,
			@RequestParam(value="kind",required=false) String kind
			) {
		
		ModelAndView mv = new ModelAndView();
		fd = new FoodsDetail(Integer.parseInt(id), name, Double.valueOf(price).doubleValue(), kind);
		if(fsi.updateFood(fd)==1)
			mv.setViewName("successfulEditFood");
		else {
			mv.addObject("status", "¸ü¸ÄÊ§°Ü£¡");
			mv.setViewName("editFood");
		}
		return mv;
	}
	

}