package com.directi.training.ocp.solution;

public interface ResourceAllocator {
    

    public int allocate();

    public void free(int resourceId);

    void markSlotFree(int resourceId);

    void markSlotBusy(int resourceId);

    int findFreeSlot();
}
