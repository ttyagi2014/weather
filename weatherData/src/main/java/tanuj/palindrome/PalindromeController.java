package tanuj.palindrome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PalindromeController {
	
	@GetMapping("/palindrome")
	public String getPalindrome(@ModelAttribute("palindrome") PalindromeFom palindrome) {
		return "palindrome";
	}
	
	@GetMapping("/palindrome/process")
	@ResponseBody
	public String getPalindromeCheck(@RequestParam("input") String input) {
		String reverse=PalindromeLogic.getReverse(input);
		
		if(reverse.equalsIgnoreCase(input)) {
			return "INPUT STRING IS PALINDROME and reverse string is: "+reverse;
		}
		return "INPUT STRING IS NOT PALINDROME and reverse string is: "+reverse;
	}

}
