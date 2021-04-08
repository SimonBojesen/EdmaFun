package dk.simonbojesen.learnedma.generated.edmaimpl.models.mydatamodel;

import dk.simonbojesen.learnedma.generated.mydatamodel.kinds.course.CourseUpdater;
import dk.simonbojesen.learnedma.generated.mydatamodel.kinds.course.CourseViewer;
import dk.simonbojesen.learnedma.generated.valuedomains.Name;
import dk.simonbojesen.learnedma.generated.valuedomains.impl.NameImpl;
import dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel.Course;
import dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel.CourseID;
import dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel.impl.CourseIDImpl;
import dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel.impl.CourseImpl;
import java.util.HashMap;
import java.util.Map;
import org.abstractica.edma.runtime.intf.IDataModelUpdate;
import org.abstractica.edma.runtime.intf.IDataModelView;
import org.abstractica.edma.runtime.intf.IEntity;
import org.abstractica.edma.runtime.intf.exceptions.UniqueException;
import org.abstractica.edma.valuedomains.IValueInstance;

/**
 * 
 */
public class CourseVUImpl implements CourseUpdater, CourseViewer
{
    protected IEntity edma_entity;
    private IDataModelView edma_dmview;



    /**
     * Constructor
     * @param edma_entity  Internal entity
     * @param edma_dmview  Internal runtime interface
     */
    public CourseVUImpl(IEntity edma_entity, IDataModelView edma_dmview)
    {
        this.edma_entity = edma_entity;
        this.edma_dmview = edma_dmview;
    }

    /**
     * Create a copy of this Course at this instance in time
     * @return  A copy of this Course entity as a value  from the value domain
     *          Course
     */
    public Course snapshot()
    {
        Object[] res = new Object[2];
        Object[] internal = edma_entity.getValue();
        res[0] = internal[0];
        res[1] = internal[1];
        return new CourseImpl(res);
    }

    /**
     * Returns the ID of this Course
     * @return  The ID of this Course
     */
    public CourseID getID()
    {
        return new CourseIDImpl(edma_entity.getID());
    }

    /**
     * Returns the attribute name of this Course
     * @return  The value of the attribute name
     */
    public Name getName()
    {
        return new NameImpl(edma_entity.getValue()[1]);
    }

    /**
     * Returns <tt>true</tt> if this entity has the same ID as the provided
     * entity
     * @param o  The object to compare with
     * @return   <tt>true</tt> if this entity has the same ID as the provided
     *           entity
     */
    public boolean equals(Object o)
    {
        if(!(o instanceof CourseViewer)) return false;
        CourseViewer other = (CourseViewer) o;
        return getID().equals(other.getID());
    }

    /**
     * Returns the hash code of this entity
     * @return  The hash code of this entity
     */
    public int hashCode()
    {
        return getID().hashCode();
    }

    /**
     * Begin attribute updates on this Course
     * @return  An attribute update interface for chaining attribute updates
     */
    public CourseAttUpd beginUpdate()
    {
        return new CourseAttUpdImpl(edma_entity.getID(), edma_dmview.getUpdateInterface());
    }


    /**
     * 
     */
    private class CourseAttUpdImpl implements CourseAttUpd
    {
        private Long entityID;
        private IDataModelUpdate edma_dmupdate;
        private Map<Integer, Object> updateMap;



        /**
         * Constructor
         * @param entityID       ID of the entity to update
         * @param edma_dmupdate  Internal runtime interface
         */
        private CourseAttUpdImpl(Long entityID, IDataModelUpdate edma_dmupdate)
        {
            this.entityID = entityID;
            this.edma_dmupdate = edma_dmupdate;
            this.updateMap = new HashMap<Integer, Object>();
        }

        /**
         * Sets the attribute name on this Course
         * @param name  The value to set
         * @return      Interface for chaining attribute updates
         */
        public CourseAttUpdUnique setName(Name name)
        {
            updateMap.put(0, ((IValueInstance) name).edma_getValue());
            return new CourseAttUpdUniqueImpl(entityID, updateMap, edma_dmupdate);
        }

        /**
         * Saves the changes to the data model.
         * @return  
         */
        public boolean save()
        {
            return edma_dmupdate.entityUpdate(2, entityID, updateMap);
        }
    }



    /**
     * 
     */
    private class CourseAttUpdUniqueImpl implements CourseAttUpdUnique
    {
        private Long entityID;
        private Map<Integer, Object> updateMap;
        private IDataModelUpdate edma_dmupdate;



        /**
         * Constructor
         * @param entityID       ID of the entity to update
         * @param updateMap      Map of updates
         * @param edma_dmupdate  Internal runtime interface
         */
        private CourseAttUpdUniqueImpl(Long entityID, Map<Integer, Object> updateMap, IDataModelUpdate edma_dmupdate)
        {
            this.entityID = entityID;
            this.updateMap = updateMap;
            this.edma_dmupdate = edma_dmupdate;
        }

        /**
         * Sets the attribute name on this Course
         * @param name  The value to set
         * @return      Interface for chaining attribute updates
         */
        public CourseAttUpdUnique setName(Name name)
        {
            updateMap.put(0, ((IValueInstance) name).edma_getValue());
            return this;
        }

        /**
         * Saves the changes to the data model.
         * @return  
         */
        public boolean save() throws UniqueException
        {
            return edma_dmupdate.entityUpdateUnique(2, entityID, updateMap);
        }
    }

}
