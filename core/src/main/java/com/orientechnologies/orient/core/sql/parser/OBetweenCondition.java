/* Generated By:JJTree: Do not edit this line. OBetweenCondition.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import com.orientechnologies.orient.core.db.record.OIdentifiable;

public class OBetweenCondition extends OBooleanExpression {

  protected OExpression first;
  protected OExpression second;
  protected OExpression third;

  public OBetweenCondition(int id) {
    super(id);
  }

  public OBetweenCondition(OrientSql p, int id) {
    super(p, id);
  }

  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  @Override
  public boolean evaluate(OIdentifiable currentRecord) {
    return false;
  }

  public OExpression getFirst() {
    return first;
  }

  public void setFirst(OExpression first) {
    this.first = first;
  }

  public OExpression getSecond() {
    return second;
  }

  public void setSecond(OExpression second) {
    this.second = second;
  }

  public OExpression getThird() {
    return third;
  }

  public void setThird(OExpression third) {
    this.third = third;
  }

  @Override
  public String toString() {
    return first.toString() + " BETWEEN " + second.toString() + " AND " + third.toString();
  }
}
/* JavaCC - OriginalChecksum=f94f4779c4a6c6d09539446045ceca89 (do not edit this line) */