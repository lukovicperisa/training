/*
 * SKU
 * TODO: Add Description
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.bosch.hybris.ptb2b.complaintmanagement.product.client.model;

import java.util.Objects;
import com.bosch.hybris.ptb2b.complaintmanagement.product.client.model.ProductResponseGenerated;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ProductWrapperGenerated
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-23T10:51:09.111+01:00")
public class ProductWrapperGenerated {
  @JsonProperty("d")
  
  public ProductWrapperGenerated d(ProductResponseGenerated d) {
    this.d = d;
    return this;
  }

   /**
   * Get d
   * @return d
  **/
  @ApiModelProperty(required = true, value = "")
  public ProductResponseGenerated getD() {
    return d;
  }

  public void setD(ProductResponseGenerated d) {
    this.d = d;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductWrapperGenerated productWrapper = (ProductWrapperGenerated) o;
    return Objects.equals(this.d, productWrapper.d);
  }

  @Override
  public int hashCode() {
    return Objects.hash(d);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductWrapperGenerated {\n");
    
    sb.append("    d: ").append(toIndentedString(d)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

