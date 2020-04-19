package com.example.obd2portbluetooth.ui.main;

public class Pid {

    enum Modes
    {
        CURRENT_DATA(0x01),
        FREEZE_FRAM_DATA(0x02),
        SHOW_STORED_DIAG_TC(0x03),
        CLEAR_STORED_DIAG_TC(0x04),
        TEST_RESULTS(0x05),
        SHOW_PENDING_DIAG_TC(0x07),
        CNTL_OPERATION(0x08),
        REQ_VEHICLE_INFO(0x09),
        PERM_DIAG_TC(0x0A);

        public final int value;

        private Modes(int value)
        {
            this.value = value;
        }
    }

    private static byte myQueryLen = 0x02;
    public long Query(byte service, byte pidCode)
    {
        long ret = 0;
        ret |= myQueryLen << 56;
        ret |= service << 48;
        ret |= pid << 40;

        return ret;
    }
}
