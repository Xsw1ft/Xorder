package cn.xswift.xorder.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.xswift.xorder.dao.FoodsSession;
import cn.xswift.xorder.dao.UserSession;
import cn.xswift.xorder.entity.FoodsDetail;
import cn.xswift.xorder.entity.User;
import cn.xswift.xorder.impl.FoodServiceImpl;
import cn.xswift.xorder.impl.UserServiceImpl;


@Controller
public class UserController {
	
	private UserServiceImpl usi;
	private FoodsSession fs;
	
	public FoodsSession getFs() {
		return fs;
	}

	public void setFs(FoodsSession fs) {
		this.fs = fs;
	}

	public UserServiceImpl getUsi() {
		return usi;
	}

	public void setUsi(UserServiceImpl usi) {
		this.usi = usi;
	}

	

	@RequestMapping(value="/index")
	public ModelAndView goIndex() {
		//�ض�����ҳ
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@RequestMapping(value="/order")
	public ModelAndView goOrder() throws IOException {
		//�ض��򵽵�˽���
		ModelAndView mv = new ModelAndView("order");
		mv.addObject("jiachang", fs.selectFoodsDetailJC());
		mv.addObject("zhushi", fs.selectFoodsDetailZS());
		mv.addObject("yinliao", fs.selectFoodsDetailYL());
		return mv;
	}
	
	@RequestMapping(value="/reserve")//�ض�������Ԥ����
	public ModelAndView goInputReservId() {
		ModelAndView mv = new ModelAndView("inputReserveId");
		return mv;
	}
	@RequestMapping(value="/ordersDetailAll")//�ض�������Ԥ����
	public ModelAndView goOrderDetailAll() {
		ModelAndView mv = new ModelAndView("ordersDetailAll");
		mv.addObject("orders", usi.selectUserOrderAllFinished());
		return mv;
	}
	@RequestMapping(value="/finishOrder")//��ɶ���
	public ModelAndView finishOrder(
			@RequestParam(value="oid",required=false) int oid
			) {
		ModelAndView mv = new ModelAndView();
		if(usi.finishOrder(oid))
		{
			mv.setViewName("successfulFinishOrder");
		}else {
			
			mv.setViewName("ordersDetail");
		}
		return mv;
	}

	@RequestMapping(value="/insideLogin")//�ض��򵽺�̨��¼����
	public ModelAndView goInsideLogin() {
		ModelAndView mv = new ModelAndView("insideLogin");
		return mv;
	}
	
	

	@RequestMapping(value="/backstage")//�ض��򵽺�̨��ҳ
	public ModelAndView goBackstage() {
		ModelAndView mv = new ModelAndView("backstage");
		return mv;
	}

	@RequestMapping(value="/ordersDetail")//�ض��򵽶�������
	public ModelAndView goOrdersDetail() {
		ModelAndView mv = new ModelAndView("ordersDetail");
		mv.addObject("orders", usi.selectUserOrderAll());
		return mv;
	}
	
	@RequestMapping(value="/putOnSale")//�ض����ϼ�ҳ��
	public ModelAndView goPutOnSale() {
		ModelAndView mv = new ModelAndView("putOnSale");
		return mv;
	}
	
	@RequestMapping(value="/successfulRegist")//ע��
	public ModelAndView checkRegist(
			@RequestParam(value="name") String name,
			@RequestParam(value="pwd") String pwd) {
		ModelAndView mv = new ModelAndView();
		if(usi.userRegist(name, pwd)) {
			mv.setViewName("successfulRegist");
		}else {
			mv.setViewName("userRegist");
			mv.addObject("status", "ע��ʧ�ܣ������û����ѱ�ʹ��");
		}
		return mv;
	}

	@RequestMapping(value="/userLogin")//�ض��򵽵�¼����
	public ModelAndView goUserLogin() {
		ModelAndView mv = new ModelAndView("userLogin");
		return mv;
	}

	@RequestMapping(value="/checkLogin")//��֤�û����
	public ModelAndView checkUserLogin(
			@RequestParam(value="name") String name,
			@RequestParam(value="pwd") String pwd) {
		ModelAndView mv = new ModelAndView();
		if(usi.userLogin(name, pwd)) {
			mv.setViewName("successfulLogin");
		}
		else {
			mv.addObject("status", "�û������ڻ��û���������������");
			mv.setViewName("userLogin");
		}
		return mv;
	}


	@RequestMapping(value="/userRegist")//�ض���ע��ҳ��
	public ModelAndView goUserRegist() {
		ModelAndView mv = new ModelAndView("userRegist");
		return mv;
	}
	
	@RequestMapping(value="/userOrder")//�û��µ�
	public ModelAndView insertUserOrder(
			@RequestParam(value="content",required=false) String content
			) {
		ModelAndView mv = new ModelAndView();
		if(usi.userOrder(content))
			mv.setViewName("successfulOrder");
		else {
			mv.setViewName("order");
		}
		return mv;
	}
	
	//test
	@RequestMapping(value="/test")
	public ModelAndView test() throws IOException {
		ModelAndView mv = new ModelAndView("test");
		mv.addObject("name", fs.selectFoodsDetailJC());
		return mv;
	}
	
	@RequestMapping(value="/ts")
	public ModelAndView ts() throws IOException {
		ModelAndView mv = new ModelAndView("test");
		int i = fs.insertFood(new FoodsDetail("aa",2,"a"));
		mv.addObject("i", i);
		return mv;
	}
}