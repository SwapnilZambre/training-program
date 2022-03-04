package com.example.nseit.spring.example.notes.notesapp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotesController {
@PostMapping("/greet/{fname}/{lname}")
public String greeting(@PathVariable("fname") String fname,
@PathVariable("lname") String lname) {
return "Hello ,"+fname+" "+lname+" "+"Welcome";
}

@GetMapping("/notes")
public Notes showNotes() {

return new Notes(1001,"Java","Praveen","Java is OOPS");
}
@GetMapping("/all") // produces the data
public List<Notes> showAllNotes() {
List<Notes> notes = new ArrayList();
notes.add(new Notes(1001,"Java","Praveen","Java is OOPS"));
notes.add(new Notes(1002,"Oracle","Anil","RDBMS Package"));
return notes;
}
@PostMapping("/add") // consumes the data
public Notes postData1(@RequestBody Notes notes) {
notes.setAuthor("Satish");
return notes;
}

@PostMapping("/post2")
public String postData2() {
return "Post2 Mapping is called";
}
@DeleteMapping("/all")
public String deleteData() {
return "Delete Mapping is called";
}
@PutMapping("/all")
public String putData() {
return "Put Mapping is called";
}
@PutMapping("/post2")
public String putPostData() {
return "Put-post2 Mapping is called";
}



}