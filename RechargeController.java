package com.gl.caseStudy17102022.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.gl.caseStudy17102022.bean.Offer;
import com.gl.caseStudy17102022.service.RechargeService;
import com.gl.caseStudy17102022.bean.Bill;
@RestController
public class RechargeController {
	@Autowired
	private RechargeService service1;
	@GetMapping("/welcomePage")
	public ModelAndView showIndexpage() {

		ModelAndView mv=new ModelAndView("welcomePage");
		List<Offer> offerList=service1.findAllOffers();
		mv.addObject("offerRecord",offerList);
		return mv;
	}

	@GetMapping("/Rechargeplan")
	public ModelAndView saveNewBill(@RequestParam("mobileNumber") Integer mn,
									  @RequestParam("offerId") long oId) {
		long id = service1.generateId();
		System.out.println(id);
		Bill bill = new Bill();
		bill.setMobileNumber(mn);
		bill.setOfferId(oId);
		bill.setTransactionId(id);
		System.out.println();
		service1.billSave(bill);
		Offer offer = service1.findAOffer(oId);
		ModelAndView mv = new ModelAndView("RechargeoutputPage");
		mv.addObject("offer",offer);
		mv.addObject("bill",bill);
		return mv;
	}

}
