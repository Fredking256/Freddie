package com.freddie.medicinetime.Alarm;

import com.freddie.medicinetime.BasePresenter;
import com.freddie.medicinetime.BaseView;
import com.freddie.medicinetime.data.source.History;
import com.freddie.medicinetime.data.source.MedicineAlarm;


public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
