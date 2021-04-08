package dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel.impl;

import dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel.Course;
import dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel.CourseList;
import dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel.CourseList.CourseListBuilder;
import java.util.ArrayList;
import org.abstractica.edma.valuedomains.IValueInstance;

/**
 * 
 */
public class CourseListBuilderImpl implements CourseListBuilder
{
    private ArrayList<Object> valueList;



    /**
     * Constructor
     */
    public CourseListBuilderImpl()
    {
        valueList = new ArrayList<Object>();
    }

    /**
     * Adds an element to the list
     * @param course  The element to be added to the list
     * @return        An interface to the builder for chaining method calls
     */
    public CourseListBuilder add(Course course)
    {
        if(course == null) throw new NullPointerException();
        valueList.add(((IValueInstance) course).edma_getValue());
        return this;
    }

    /**
     * Builds the list with the added elements
     * @return  The builded list
     */
    public CourseList end()
    {
        Object[] res = new Object[valueList.size()];
        int pos = 0;
        for(Object o : valueList)
        {
            res[pos++] = o;
        }
        return new CourseListImpl(CourseListImpl.edma_create(res));
    }
}
