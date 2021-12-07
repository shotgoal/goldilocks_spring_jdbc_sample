package com.sunje.test.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
 
@RestController
public class TestController {
    
	@Autowired
    private BoardRepository boardRepository;
	
	private PersonRepository personRepository; 
	
    @RequestMapping("/selectAll")
    public List<Board> SelectAll(){
    	return boardRepository.findAll();
    }
    @RequestMapping("/selectWhereC1")
    public List<Board> findByC1(){
    	return boardRepository.findByC1(1);
    }
    @RequestMapping("/insert")
    public Board Insert(){
        Board valueToInsert =new Board(3,"Park",90,80,88,94,96,88,80,"2020-05-05");
        return boardRepository.save(valueToInsert);
    }
    @RequestMapping("/update")
	public List<Board> update(){
        List<Board> updatedValue = boardRepository.findByC1(3);
        int len=updatedValue.size();
        	
        for(int i=0;i<len;i++) {
        	updatedValue.get(i).setC5(100);
        	boardRepository.save(updatedValue.get(i));
        }
        return updatedValue;
    }
    @RequestMapping("/deleteWhereC1")
    public String DeleteWhereC5() {
    List<Board> deletedValue = boardRepository.findByC1(1);
    int len=deletedValue.size();
    
    for(int i=0;i<len;i++) {
    	boardRepository.delete(deletedValue.get(i));
    }
    return "Delete succeeded.";
}
    @RequestMapping("/deleteAll")
    public String DeleteAll() {
        boardRepository.deleteAll();
        return "Delete succeeded.";
    }
    @RequestMapping("/count")
    public Long Count() {
        return boardRepository.count();
    }
    
	@RequestMapping("/Select")
	public List<Person> Select() {
		return  personRepository.findByFirstName("TEST");		
	}
}
