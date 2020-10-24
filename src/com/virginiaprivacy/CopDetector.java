/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.virginiaprivacy;

public class CopDetector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CopDetector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CopDetector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        detectorJNI.delete_CopDetector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CopDetector() {
    this(detectorJNI.new_CopDetector(), true);
  }

  public int countFaces(String file) {
    return detectorJNI.CopDetector_countFaces(swigCPtr, this, file);
  }

  public int totalRuntime() {
    return detectorJNI.CopDetector_totalRuntime(swigCPtr, this);
  }

  public int numPolices() {
    return detectorJNI.CopDetector_numPolices(swigCPtr, this);
  }

  public void createPolice(String imagePath, String copName) {
    detectorJNI.CopDetector_createPolice(swigCPtr, this, imagePath, copName);
  }

  public void save() {
    detectorJNI.CopDetector_save(swigCPtr, this);
  }

  public void load() {
    detectorJNI.CopDetector_load(swigCPtr, this);
  }

  public static String getNameFromFile(String file) {
    return detectorJNI.CopDetector_getNameFromFile(file);
  }

  public String identifyImage(String file) {
    return detectorJNI.CopDetector_identifyImage(swigCPtr, this, file);
  }

  public String getCopName(int index) {
    return detectorJNI.CopDetector_getCopName(swigCPtr, this, index);
  }

}