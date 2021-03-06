package com.shurona.showtem.views;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shurona.showtem.board.BoardVO;
import com.shurona.showtem.board.GroupVO;
import com.shurona.showtem.board.Page;
import com.shurona.showtem.board.SebuVO;
import com.shurona.showtem.board.impl.BoardService;

@Controller
@RequestMapping(value="/board/*")
public class BoardController {

@Inject
private BoardService service;
	
 @RequestMapping(value = "/list", method = RequestMethod.GET)
 public void getList(Model model) throws Exception {
  
   List<BoardVO> list = null;
   list = service.list();

   model.addAttribute("list",list);
   System.out.println(model);
   //   return "/board/list";
 }
 
 @RequestMapping(value = "/listPage", method = RequestMethod.GET)
 public void getListPage(Model model, @RequestParam("num") int num) throws Exception {
  
	 Page page = new Page();
	 page.setNum(num);
	 page.setCount(service.count());  

	 List<BoardVO> list = null; 
	 list = service.listPage(page.getDisplayPost(), page.getPostNum());

	 model.addAttribute("list", list);   
	 model.addAttribute("page", page);
	 model.addAttribute("select", num);
 }
 
 @RequestMapping(value = "/listPageSearch", method = RequestMethod.GET)
 public void getListPageSearch(Model model, @RequestParam(value = "num") int num,
		 @RequestParam(value = "belt", required=false, defaultValue = "0" ) String belt,
		 @RequestParam(value = "sword", required=false, defaultValue = "0" ) String sword,
		 @RequestParam(value = "recurve", required=false, defaultValue = "0" ) String recurve,
		 @RequestParam(value = "spatula", required=false, defaultValue = "0" ) String spatula,
		 @RequestParam(value = "chain", required=false, defaultValue = "0" ) String chain,
		 @RequestParam(value = "large", required=false, defaultValue = "0" ) String large,
		 @RequestParam(value = "tear", required=false, defaultValue = "0" ) String tear,
		 @RequestParam(value = "gloves", required=false, defaultValue = "0" ) String gloves,
		 @RequestParam(value = "cloak", required=false, defaultValue = "0" ) String cloak
		 ) throws Exception{
	 
  
	 Page page = new Page();
	 page.setNum(num);
	 page.setBelt(belt);
	 page.setSword(sword);
	 page.setRecurve(recurve);
	 page.setSpatula(spatula);
	 page.setChain(chain);
	 page.setLarge(large);
	 page.setTear(tear);
	 page.setGloves(gloves);
	 page.setCloak(cloak);
	 page.setCount(service.searchCount(sword, belt, recurve, chain, large, tear, gloves, cloak, spatula));
	 
	 List<BoardVO> list = null; 
	 list = service.listPageSearch(page.getDisplayPost(), page.getPostNum(), belt, sword,
			 recurve, chain, large, tear, gloves, cloak, spatula);

	 model.addAttribute("list", list);   
	 model.addAttribute("page", page);
	 model.addAttribute("select", num);	 
 }

@RequestMapping(value = "/johabGroup", method = RequestMethod.GET)
public void getJohabGroup(Model model,
		 @RequestParam(value = "belt", required=false, defaultValue = "0" ) String belt,
		 @RequestParam(value = "sword", required=false, defaultValue = "0" ) String sword,
		 @RequestParam(value = "recurve", required=false, defaultValue = "0" ) String recurve,
		 @RequestParam(value = "spatula", required=false, defaultValue = "0" ) String spatula,
		 @RequestParam(value = "chain", required=false, defaultValue = "0" ) String chain,
		 @RequestParam(value = "large", required=false, defaultValue = "0" ) String large,
		 @RequestParam(value = "tear", required=false, defaultValue = "0" ) String tear,
		 @RequestParam(value = "gloves", required=false, defaultValue = "0" ) String gloves,
		 @RequestParam(value = "cloak", required=false, defaultValue = "0" ) String cloak
		) throws Exception {
	List<GroupVO> list = null;
	list = service.groupSearch(belt, sword, recurve, chain, large, tear, gloves, cloak, spatula);
	
	model.addAttribute("list", list);
	
}

@RequestMapping(value = "/listjohab", method = RequestMethod.GET)
public void getListjohab(Model model,
		 @RequestParam(value = "belt", required=false, defaultValue = "0" ) String belt,
		 @RequestParam(value = "sword", required=false, defaultValue = "0" ) String sword,
		 @RequestParam(value = "recurve", required=false, defaultValue = "0" ) String recurve,
		 @RequestParam(value = "spatula", required=false, defaultValue = "0" ) String spatula,
		 @RequestParam(value = "chain", required=false, defaultValue = "0" ) String chain,
		 @RequestParam(value = "large", required=false, defaultValue = "0" ) String large,
		 @RequestParam(value = "tear", required=false, defaultValue = "0" ) String tear,
		 @RequestParam(value = "gloves", required=false, defaultValue = "0" ) String gloves,
		 @RequestParam(value = "cloak", required=false, defaultValue = "0" ) String cloak
		 ) throws Exception{
	
	List<GroupVO> list = null;
	list = service.simGroupSearch(belt, sword, recurve, chain, large, tear, gloves, cloak, spatula);
	
	 Page page = new Page();

	 page.setBelt(belt);
	 page.setSword(sword);
	 page.setRecurve(recurve);
	 page.setSpatula(spatula);
	 page.setChain(chain);
	 page.setLarge(large);
	 page.setTear(tear);
	 page.setGloves(gloves);
	 page.setCloak(cloak);
	
	 
	model.addAttribute("page",page);
	model.addAttribute("list",list);
	
}


@RequestMapping(value = "/simJohab", method = RequestMethod.GET)
public void getSimJohab(Model model,
		 @RequestParam(value = "belt", required=false, defaultValue = "0" ) String belt,
		 @RequestParam(value = "sword", required=false, defaultValue = "0" ) String sword,
		 @RequestParam(value = "recurve", required=false, defaultValue = "0" ) String recurve,
		 @RequestParam(value = "spatula", required=false, defaultValue = "0" ) String spatula,
		 @RequestParam(value = "chain", required=false, defaultValue = "0" ) String chain,
		 @RequestParam(value = "large", required=false, defaultValue = "0" ) String large,
		 @RequestParam(value = "tear", required=false, defaultValue = "0" ) String tear,
		 @RequestParam(value = "gloves", required=false, defaultValue = "0" ) String gloves,
		 @RequestParam(value = "cloak", required=false, defaultValue = "0" ) String cloak,
		 @RequestParam(value = "johab", required=false, defaultValue = "0" ) String johab
		 ) throws Exception{
	
	
	 Page oldpage = new Page();
	 BoardVO board = new BoardVO();
	 List<BoardVO> newboard = null;
	 newboard = service.simJohab(belt, sword, recurve, chain, large, tear, gloves, cloak, spatula, johab);
	 
	 oldpage.setBelt(belt);
	 oldpage.setSword(sword);
	 oldpage.setRecurve(recurve);
	 oldpage.setSpatula(spatula);
	 oldpage.setChain(chain);
	 oldpage.setLarge(large);
	 oldpage.setTear(tear);
	 oldpage.setGloves(gloves);
	 oldpage.setCloak(cloak);
	 board.setJohab(johab);
	
	 model.addAttribute("oldpage", oldpage);
	 model.addAttribute("board",board);
	 model.addAttribute("newboard", newboard);
	}

@RequestMapping(value="/sebujohab", method = RequestMethod.GET)
public void getSebuJohab(Model model, @RequestParam("id") int id) throws Exception{
	SebuVO sebu = null;
	sebu = service.sebuJohab(id);
	model.addAttribute("sebu",sebu);
}

}