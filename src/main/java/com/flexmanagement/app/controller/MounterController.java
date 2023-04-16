package com.flexmanagement.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flexmanagement.app.model.Location;
import com.flexmanagement.app.model.Mounter;
import com.flexmanagement.app.service.MounterServiceI;

@Controller
@RequestMapping(value="/Dashboard/")
public class MounterController
{
	@Autowired
	MounterServiceI MounterService;
	@RequestMapping(value="/mounterHome")
	public String mounterIndex()
	{
		return "mounterHome";
	}
	@RequestMapping(value="/addMounterForm")
	public String addMounter()
	{
		return "InsertMounter";
	}
	@RequestMapping(value="/addMounter")
	public String addMounter(@ModelAttribute Mounter mounter)
	{
		MounterService.addMounter(mounter);
		return "redirect:/addMounterForm";
	}
	@RequestMapping(value="/viewMounterForm")
	public String viewMounter()
	{
		return "ViewMounter";
	}
	@RequestMapping(value="/viewMounter")
	public String viewMounter(@RequestParam int mounterId,ModelMap m)
	{
		List<Mounter> mounterList =MounterService.viewMounterById(mounterId);
		m.addAttribute("mounterList",mounterList);
		return "ViewMounter";
	}
	@RequestMapping(value="/viewAllMounters")
	public String viewMounter(ModelMap m) 
	{
		List<Mounter> mounterList =MounterService.viewAllMounters();
		m.addAttribute("mounterList",mounterList);
		return"ViewMounter";
	}
	@RequestMapping(value="/deleteMounterForm")
	public String deleteMounter()
	{
		return "DeleteMounter";
	}
	@RequestMapping(value="/deleteMounter")
	public String deleteMounter(@RequestParam int mounterId)
	{
		MounterService.deleteMounter(mounterId);
		return "DeleteMounter";
	}
	@RequestMapping(value="/deleteAllMounters")
	public String deleteAllMounters()
	{
		MounterService.deleteAllMounter();
		return "DeleteMounter";
	}
	@RequestMapping(value="/updateMounterForm")
	public String updateMounter()
	{
		return "UpdateMounter";
	}
	@RequestMapping(value="/retrieveMounter")
	public String updateLocation(@RequestParam int mounterId,ModelMap m)
	{
		Mounter mounter = MounterService.getMounter(mounterId);
		m.addAttribute("mounter",mounter);
		return "UpdateMounter";
	}
	@RequestMapping(value="/updateMounter")
	public String updateLocation(@ModelAttribute Mounter mounter)
	{
		MounterService.addMounter(mounter);
		return "redirect:/addMounterForm";
	}
}
