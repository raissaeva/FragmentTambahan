package com.example.fragmenttambahan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class PageViewModel extends ViewModel {
    private MutableLiveData<String> mName = new MutableLiveData<>();
    private MutableLiveData<String> mTTL = new MutableLiveData<>();
    private MutableLiveData<String> mCita = new MutableLiveData<>();
    private MutableLiveData<String> mHobi = new MutableLiveData<>();
    private MutableLiveData<String> mImpian = new MutableLiveData<>();

    public void setName(String name) {
        mName.setValue(name);
    }
    public LiveData<String> getName() {
        return mName;
    }

    public void setTTL(String ttl) {
        mTTL.setValue(ttl);
    }
    public LiveData<String> getTTL() {
        return mTTL;
    }

    public void setCita(String cita) {
        mCita.setValue(cita);
    }
    public LiveData<String> getCita() {
        return mCita;
    }

    public void setHobi(String hobi) {
        mHobi.setValue(hobi);
    }
    public LiveData<String> getHobi() {
        return mHobi;
    }

    public void setImpian(String impian) {
        mImpian.setValue(impian);
    }
    public LiveData<String> getImpian() {
        return mImpian;
    }
}
