package org.pentaho.metadata.model;

import org.pentaho.metadata.model.concept.Concept;
import org.pentaho.metadata.model.concept.IConcept;
import org.pentaho.metadata.model.concept.types.DataType;

public class LogicalColumn extends Concept {

  private LogicalTable logicalTable;
  private IPhysicalColumn physicalColumn;
  
  public IPhysicalColumn getPhysicalColumn() {
    return physicalColumn;
  }

  public void setPhysicalColumn(IPhysicalColumn physicalColumn) {
    this.physicalColumn = physicalColumn;
  }

  public DataType getDataType() {
    return (DataType)getProperty(IPhysicalColumn.DATATYPE_PROPERTY);
  }

  public void setDataType(DataType dataType) {
    setProperty(IPhysicalColumn.DATATYPE_PROPERTY, dataType);
  };
  
  @Override
  public IConcept getInheritedConcept() {
    return physicalColumn;
  }
  
  @Override
  public IConcept getSecurityParentConcept() {
    return logicalTable;
  }

}