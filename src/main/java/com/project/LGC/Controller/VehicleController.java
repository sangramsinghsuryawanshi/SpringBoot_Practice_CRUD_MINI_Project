package com.project.LGC.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.LGC.Model.VehicleTracker;
import com.project.LGC.Repository.VehicalTrackerConnection;

@Controller
public class VehicleController {

	@Autowired
	private VehicalTrackerConnection VTC;

	@RequestMapping("/")
	public String LandingPage() {
		return "redirect:Vehical/InsertVehical.jsp";
	}

	@RequestMapping("/insert")
	public String isInsert(@ModelAttribute VehicleTracker VT, Model mav) {
		VTC.save(VT);
		mav.addAttribute("message", "Data submmited successfully..!");

		return "Vehical/InsertVehical.jsp";
	}

	@RequestMapping("/fetch")
	public ModelAndView isFetch() {
		ModelAndView mo = new ModelAndView("Vehical/UpdateVehical.jsp");
		List<VehicleTracker> vtList = VTC.findAll();
		mo.addObject("vehicalList", vtList);
		return mo;
	}

	@RequestMapping("/update")
	public String isUpdate(Model mav, @ModelAttribute VehicleTracker VET, @RequestParam int id) {
		VehicleTracker VT = VTC.findById(id).orElse(null);
		if (VT != null) {
			VT.setVehicaleType(VET.getVehicaleType());
			VT.setDrivarName(VET.getDrivarName());
			VT.setVehicaleStartLocation(VET.getVehicaleStartLocation());
			VT.setVehicaleLocation(VET.getVehicaleLocation());
			VT.setGoodsName(VET.getGoodsName());
			VT.setVehicalCapacity(VET.getVehicalCapacity());
			VT.setVehicaleEndLocation(VET.getVehicaleEndLocation());
			VT.setStatus(VET.getStatus());
			VTC.save(VT);
		}
		mav.addAttribute("message", "Data updated successfully!");
		return "forward:/fetch";
	}
}
