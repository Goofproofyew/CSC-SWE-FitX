// Generated by view binder compiler. Do not edit!
package com.example.fitx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.fitx.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HomePageBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatButton AllExercises;

  @NonNull
  public final AppCompatButton HealthyTips;

  @NonNull
  public final AppCompatButton createAWorkoutButton;

  @NonNull
  public final AppCompatButton inputUserWorkoutDataButton;

  @NonNull
  public final AppCompatButton toSports;

  @NonNull
  public final AppCompatButton userSport;

  @NonNull
  public final AppCompatButton userWorkoutsButton;

  private HomePageBinding(@NonNull LinearLayout rootView, @NonNull AppCompatButton AllExercises,
      @NonNull AppCompatButton HealthyTips, @NonNull AppCompatButton createAWorkoutButton,
      @NonNull AppCompatButton inputUserWorkoutDataButton, @NonNull AppCompatButton toSports,
      @NonNull AppCompatButton userSport, @NonNull AppCompatButton userWorkoutsButton) {
    this.rootView = rootView;
    this.AllExercises = AllExercises;
    this.HealthyTips = HealthyTips;
    this.createAWorkoutButton = createAWorkoutButton;
    this.inputUserWorkoutDataButton = inputUserWorkoutDataButton;
    this.toSports = toSports;
    this.userSport = userSport;
    this.userWorkoutsButton = userWorkoutsButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HomePageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HomePageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.home_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HomePageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.AllExercises;
      AppCompatButton AllExercises = ViewBindings.findChildViewById(rootView, id);
      if (AllExercises == null) {
        break missingId;
      }

      id = R.id.HealthyTips;
      AppCompatButton HealthyTips = ViewBindings.findChildViewById(rootView, id);
      if (HealthyTips == null) {
        break missingId;
      }

      id = R.id.createAWorkoutButton;
      AppCompatButton createAWorkoutButton = ViewBindings.findChildViewById(rootView, id);
      if (createAWorkoutButton == null) {
        break missingId;
      }

      id = R.id.inputUserWorkoutDataButton;
      AppCompatButton inputUserWorkoutDataButton = ViewBindings.findChildViewById(rootView, id);
      if (inputUserWorkoutDataButton == null) {
        break missingId;
      }

      id = R.id.toSports;
      AppCompatButton toSports = ViewBindings.findChildViewById(rootView, id);
      if (toSports == null) {
        break missingId;
      }

      id = R.id.userSport;
      AppCompatButton userSport = ViewBindings.findChildViewById(rootView, id);
      if (userSport == null) {
        break missingId;
      }

      id = R.id.userWorkoutsButton;
      AppCompatButton userWorkoutsButton = ViewBindings.findChildViewById(rootView, id);
      if (userWorkoutsButton == null) {
        break missingId;
      }

      return new HomePageBinding((LinearLayout) rootView, AllExercises, HealthyTips,
          createAWorkoutButton, inputUserWorkoutDataButton, toSports, userSport,
          userWorkoutsButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
