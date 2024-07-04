package com.sbczk.mcalsync.service.calendar;

public interface SyncService {
    public static String KIND = "UNKNOWN";

    public void fetchEvents();
    public void pushEvents();
}
