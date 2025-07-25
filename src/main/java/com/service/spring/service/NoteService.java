package com.service.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.spring.dao.NoteDAO;
import com.service.spring.domain.Note;

@Service
public class NoteService {
	
	@Autowired
	private NoteDAO noteDAO;
	
	public Note addNote(Note note) throws Exception {
		return noteDAO.addNote(note);
	}
	
	public int deleteNote(int vo) throws Exception {
		return noteDAO.deleteNote(vo);
	}
	
	public Note changNote(Note note) throws Exception{
		return noteDAO.changeNote(note);
	}
	
	public int isImpNote(int vo) throws Exception{
		return noteDAO.isImpNote(vo);
	}
	
	public List<Note> getAllNote(int vo) throws Exception{
		return noteDAO.getAllNote(vo);
	}
	
	public List<Note> getImpNote(int vo) throws Exception{
		return noteDAO.getImpNote(vo);
	}
}
