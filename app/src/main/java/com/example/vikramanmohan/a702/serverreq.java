package com.example.vikramanmohan.a702;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.ProgressBar;

/**
 * Created by vikramanmohan on 29/04/17.
 */

public class serverreq {

    ProgressDialog progressDialog;
    public static final int CONNECTION_TIMEOUT=1000*15;
    public static final String SERVER_ADDRESS="https://www.google.co.nz/";

    public serverreq(Context context)
    {
        progressDialog = new ProgressDialog(context);
        progressDialog.setCancelable(false);
        progressDialog.setTitle("Processing");
        progressDialog.setMessage("Please Wait...");

    }

    public void storeUserDataInBackground(user user,getUserCallBack userCallBack){
        progressDialog.show();


    }

    public void fetchUserDataInBackground(user user,getUserCallBack callBack){
        progressDialog.show();

    }

    public class StoredUserDataAsyncTask extends AsyncTask<Void,Void,Void>{
        user user;
        getUserCallBack userCallBack;
        public StoredUserDataAsyncTask(user user,getUserCallBack userCallBack){
            this.user=user;
            this.userCallBack=userCallBack;
    }
    @Override
        protected Void doInBackground(Void... params) {

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {

            progressDialog.dismiss();
            userCallBack.done(null);
            super.onPostExecute(aVoid);
        }
    }

}
