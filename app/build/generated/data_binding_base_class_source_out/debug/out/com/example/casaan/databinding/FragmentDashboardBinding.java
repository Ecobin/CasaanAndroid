// Generated by view binder compiler. Do not edit!
package com.example.casaan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.casaan.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDashboardBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button44;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView9;

  @NonNull
  public final TextView textViewPowerUsage;

  @NonNull
  public final TextView textViewSmartmeterWatt;

  private FragmentDashboardBinding(@NonNull ConstraintLayout rootView, @NonNull Button button44,
      @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12,
      @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView9,
      @NonNull TextView textViewPowerUsage, @NonNull TextView textViewSmartmeterWatt) {
    this.rootView = rootView;
    this.button44 = button44;
    this.textView10 = textView10;
    this.textView11 = textView11;
    this.textView12 = textView12;
    this.textView5 = textView5;
    this.textView6 = textView6;
    this.textView9 = textView9;
    this.textViewPowerUsage = textViewPowerUsage;
    this.textViewSmartmeterWatt = textViewSmartmeterWatt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDashboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_dashboard, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDashboardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button44;
      Button button44 = rootView.findViewById(id);
      if (button44 == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = rootView.findViewById(id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = rootView.findViewById(id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.textView12;
      TextView textView12 = rootView.findViewById(id);
      if (textView12 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = rootView.findViewById(id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = rootView.findViewById(id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = rootView.findViewById(id);
      if (textView9 == null) {
        break missingId;
      }

      id = R.id.textViewPowerUsage;
      TextView textViewPowerUsage = rootView.findViewById(id);
      if (textViewPowerUsage == null) {
        break missingId;
      }

      id = R.id.textViewSmartmeterWatt;
      TextView textViewSmartmeterWatt = rootView.findViewById(id);
      if (textViewSmartmeterWatt == null) {
        break missingId;
      }

      return new FragmentDashboardBinding((ConstraintLayout) rootView, button44, textView10,
          textView11, textView12, textView5, textView6, textView9, textViewPowerUsage,
          textViewSmartmeterWatt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}