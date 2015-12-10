package com.outhreeit.quickrbooks.webcontroller;

import com.outhreeit.quickrbooks.entities.BaseEntity;
import com.outhreeit.quickrbooks.entities.User;
import com.outhreeit.quickrbooks.services.BaseService;
import com.outhreeit.quickrbooks.services.UserService;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public abstract class BaseController<T extends BaseEntity> implements IBaseController<T> {

    protected BaseService<T> service;

    public BaseController(BaseService service) {
        this.service = service;
    }

    @RequestMapping(value="", method= RequestMethod.GET)
    public List<T> getAll() {
        return service.getAll();
    }

    @RequestMapping(value="", method=RequestMethod.POST)
    public void add(@RequestBody T t) {
        System.out.println(t);
        service.add(t);
    }

    @RequestMapping(value="", method=RequestMethod.PUT)
    public void update(@RequestBody T t) {
        service.update(t);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public T getByID(@PathVariable Integer id) {
        return (T) service.getByID(id);
    } 

}
