/**
 * 
 */
package br.edu.tagarelas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RicardoRodriguez
 *
 */
@RestController
public class LoginController {
	
	@RequestMapping("/")
	public String index(){
		return "Acessei o sistema";
	}
	
}
