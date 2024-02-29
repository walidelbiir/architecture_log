package com.directi.training.ocp.solution;

public class TimeSlotAllocator implements ResourceAllocator {
  public int allocate() {
    int resourceId;
    resourceId = findFreeSlot();
    markSlotBusy(resourceId);
    return resourceId;
  }
  public void free(int resourceId) {

    markSlotFree(resourceId);
  }
  public int findFreeSlot(){
    return 0;
  }
  public void markSlotBusy(int resourceId){
  }
  public void markSlotFree(int resourceId){

  }
}
