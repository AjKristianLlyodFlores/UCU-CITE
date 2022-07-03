package com.example.ucu_cite;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class ExampleDialog extends AppCompatDialogFragment {
    private EditText nickname1,nickname2;
    private ExampleDialogListener listener;
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_dialog,null);

        builder.setView(view)
                .setTitle("Login")
                .setNegativeButton("back", new DialogInterface.OnClickListener( ) {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setPositiveButton("submit", new DialogInterface.OnClickListener( ) {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String grade1 = nickname1.getText().toString();
                        String grade2 = nickname2.getText().toString();
                        listener.applyTexts(grade1,grade2);
                    }
                });
        nickname1 = view.findViewById(R.id.nickname);
        nickname2 = view.findViewById(R.id.nickname1);

        return builder.create();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            listener = (ExampleDialogListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException( context.toString() + "must implement ExampleDialogListener");
        }
    }

    public interface ExampleDialogListener{
        void applyTexts(String grade1, String grade2);
    }
}
