package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Filter;

@RestController
public class FilteringController {

@GetMapping("filtering")
public MappingJacksonValue filtering(){
    SomeBean someBean = new SomeBean( "value1","value2","value3");
    MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);
    SimpleBeanPropertyFilter simpleBeanPropertyFilter = SimpleBeanPropertyFilter.filterOutAllExcept("field1","field3");
    FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", simpleBeanPropertyFilter);
    mappingJacksonValue.setFilters(filters);
     return mappingJacksonValue;
}
    @GetMapping("/filtering_List")
    public MappingJacksonValue filteringList(){
        List<SomeBean>  list = Arrays.asList(new SomeBean("value4","value5","value6"),
            new SomeBean("value7","value8","value9"),
            new SomeBean("value10","value11","value12"));
        MappingJacksonValue jacksonValue = new MappingJacksonValue(list);
         SimpleBeanPropertyFilter filterTheBeanProperty = SimpleBeanPropertyFilter.filterOutAllExcept("field2","field3");
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("SomeBeanFilter", filterTheBeanProperty);
        jacksonValue.setFilters(filterProvider);
        return jacksonValue;
    }
}
