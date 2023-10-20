// Generated by view binder compiler. Do not edit!
package com.example.fitx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.fitx.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class VolleyballWorkoutsFragBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final ConstraintLayout boxJumpsLayout;

  @NonNull
  public final AppCompatButton boxJumpsPlayVideo;

  @NonNull
  public final TextView boxJumpsText;

  @NonNull
  public final AppCompatButton enterFullScreenButton;

  @NonNull
  public final TextView fullScreenNotice;

  @NonNull
  public final FrameLayout fullScreenViewContainer;

  @NonNull
  public final ConstraintLayout highKneesLayout;

  @NonNull
  public final AppCompatButton highKneesPlayVideo;

  @NonNull
  public final TextView highKneesText;

  @NonNull
  public final ConstraintLayout lateralShufflesLayout;

  @NonNull
  public final AppCompatButton lateralShufflesPlayVideo;

  @NonNull
  public final TextView lateralShufflesText;

  @NonNull
  public final ConstraintLayout lungesLayout;

  @NonNull
  public final AppCompatButton lungesPlayVideo;

  @NonNull
  public final TextView lungesText;

  @NonNull
  public final ConstraintLayout overHeadPressLayout;

  @NonNull
  public final AppCompatButton overHeadPressPlayVideo;

  @NonNull
  public final TextView overHeadPressText;

  @NonNull
  public final ConstraintLayout planksLayout;

  @NonNull
  public final AppCompatButton planksPlayVideo;

  @NonNull
  public final TextView planksText;

  @NonNull
  public final ConstraintLayout pushUpsLayout;

  @NonNull
  public final AppCompatButton pushUpsPlayVideo;

  @NonNull
  public final TextView pushUpsText;

  @NonNull
  public final ConstraintLayout squatsLayout;

  @NonNull
  public final AppCompatButton squatsPlayVideo;

  @NonNull
  public final TextView squatsText;

  @NonNull
  public final YouTubePlayerView theVideoPlayer;

  @NonNull
  public final TextView volleyballHeader;

  private VolleyballWorkoutsFragBinding(@NonNull NestedScrollView rootView,
      @NonNull ConstraintLayout boxJumpsLayout, @NonNull AppCompatButton boxJumpsPlayVideo,
      @NonNull TextView boxJumpsText, @NonNull AppCompatButton enterFullScreenButton,
      @NonNull TextView fullScreenNotice, @NonNull FrameLayout fullScreenViewContainer,
      @NonNull ConstraintLayout highKneesLayout, @NonNull AppCompatButton highKneesPlayVideo,
      @NonNull TextView highKneesText, @NonNull ConstraintLayout lateralShufflesLayout,
      @NonNull AppCompatButton lateralShufflesPlayVideo, @NonNull TextView lateralShufflesText,
      @NonNull ConstraintLayout lungesLayout, @NonNull AppCompatButton lungesPlayVideo,
      @NonNull TextView lungesText, @NonNull ConstraintLayout overHeadPressLayout,
      @NonNull AppCompatButton overHeadPressPlayVideo, @NonNull TextView overHeadPressText,
      @NonNull ConstraintLayout planksLayout, @NonNull AppCompatButton planksPlayVideo,
      @NonNull TextView planksText, @NonNull ConstraintLayout pushUpsLayout,
      @NonNull AppCompatButton pushUpsPlayVideo, @NonNull TextView pushUpsText,
      @NonNull ConstraintLayout squatsLayout, @NonNull AppCompatButton squatsPlayVideo,
      @NonNull TextView squatsText, @NonNull YouTubePlayerView theVideoPlayer,
      @NonNull TextView volleyballHeader) {
    this.rootView = rootView;
    this.boxJumpsLayout = boxJumpsLayout;
    this.boxJumpsPlayVideo = boxJumpsPlayVideo;
    this.boxJumpsText = boxJumpsText;
    this.enterFullScreenButton = enterFullScreenButton;
    this.fullScreenNotice = fullScreenNotice;
    this.fullScreenViewContainer = fullScreenViewContainer;
    this.highKneesLayout = highKneesLayout;
    this.highKneesPlayVideo = highKneesPlayVideo;
    this.highKneesText = highKneesText;
    this.lateralShufflesLayout = lateralShufflesLayout;
    this.lateralShufflesPlayVideo = lateralShufflesPlayVideo;
    this.lateralShufflesText = lateralShufflesText;
    this.lungesLayout = lungesLayout;
    this.lungesPlayVideo = lungesPlayVideo;
    this.lungesText = lungesText;
    this.overHeadPressLayout = overHeadPressLayout;
    this.overHeadPressPlayVideo = overHeadPressPlayVideo;
    this.overHeadPressText = overHeadPressText;
    this.planksLayout = planksLayout;
    this.planksPlayVideo = planksPlayVideo;
    this.planksText = planksText;
    this.pushUpsLayout = pushUpsLayout;
    this.pushUpsPlayVideo = pushUpsPlayVideo;
    this.pushUpsText = pushUpsText;
    this.squatsLayout = squatsLayout;
    this.squatsPlayVideo = squatsPlayVideo;
    this.squatsText = squatsText;
    this.theVideoPlayer = theVideoPlayer;
    this.volleyballHeader = volleyballHeader;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static VolleyballWorkoutsFragBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static VolleyballWorkoutsFragBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.volleyball_workouts_frag, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static VolleyballWorkoutsFragBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.boxJumpsLayout;
      ConstraintLayout boxJumpsLayout = ViewBindings.findChildViewById(rootView, id);
      if (boxJumpsLayout == null) {
        break missingId;
      }

      id = R.id.boxJumpsPlayVideo;
      AppCompatButton boxJumpsPlayVideo = ViewBindings.findChildViewById(rootView, id);
      if (boxJumpsPlayVideo == null) {
        break missingId;
      }

      id = R.id.boxJumpsText;
      TextView boxJumpsText = ViewBindings.findChildViewById(rootView, id);
      if (boxJumpsText == null) {
        break missingId;
      }

      id = R.id.enterFullScreenButton;
      AppCompatButton enterFullScreenButton = ViewBindings.findChildViewById(rootView, id);
      if (enterFullScreenButton == null) {
        break missingId;
      }

      id = R.id.fullScreenNotice;
      TextView fullScreenNotice = ViewBindings.findChildViewById(rootView, id);
      if (fullScreenNotice == null) {
        break missingId;
      }

      id = R.id.full_screen_view_container;
      FrameLayout fullScreenViewContainer = ViewBindings.findChildViewById(rootView, id);
      if (fullScreenViewContainer == null) {
        break missingId;
      }

      id = R.id.highKneesLayout;
      ConstraintLayout highKneesLayout = ViewBindings.findChildViewById(rootView, id);
      if (highKneesLayout == null) {
        break missingId;
      }

      id = R.id.highKneesPlayVideo;
      AppCompatButton highKneesPlayVideo = ViewBindings.findChildViewById(rootView, id);
      if (highKneesPlayVideo == null) {
        break missingId;
      }

      id = R.id.highKneesText;
      TextView highKneesText = ViewBindings.findChildViewById(rootView, id);
      if (highKneesText == null) {
        break missingId;
      }

      id = R.id.lateralShufflesLayout;
      ConstraintLayout lateralShufflesLayout = ViewBindings.findChildViewById(rootView, id);
      if (lateralShufflesLayout == null) {
        break missingId;
      }

      id = R.id.lateralShufflesPlayVideo;
      AppCompatButton lateralShufflesPlayVideo = ViewBindings.findChildViewById(rootView, id);
      if (lateralShufflesPlayVideo == null) {
        break missingId;
      }

      id = R.id.lateralShufflesText;
      TextView lateralShufflesText = ViewBindings.findChildViewById(rootView, id);
      if (lateralShufflesText == null) {
        break missingId;
      }

      id = R.id.lungesLayout;
      ConstraintLayout lungesLayout = ViewBindings.findChildViewById(rootView, id);
      if (lungesLayout == null) {
        break missingId;
      }

      id = R.id.lungesPlayVideo;
      AppCompatButton lungesPlayVideo = ViewBindings.findChildViewById(rootView, id);
      if (lungesPlayVideo == null) {
        break missingId;
      }

      id = R.id.lungesText;
      TextView lungesText = ViewBindings.findChildViewById(rootView, id);
      if (lungesText == null) {
        break missingId;
      }

      id = R.id.overHeadPressLayout;
      ConstraintLayout overHeadPressLayout = ViewBindings.findChildViewById(rootView, id);
      if (overHeadPressLayout == null) {
        break missingId;
      }

      id = R.id.overHeadPressPlayVideo;
      AppCompatButton overHeadPressPlayVideo = ViewBindings.findChildViewById(rootView, id);
      if (overHeadPressPlayVideo == null) {
        break missingId;
      }

      id = R.id.overHeadPressText;
      TextView overHeadPressText = ViewBindings.findChildViewById(rootView, id);
      if (overHeadPressText == null) {
        break missingId;
      }

      id = R.id.planksLayout;
      ConstraintLayout planksLayout = ViewBindings.findChildViewById(rootView, id);
      if (planksLayout == null) {
        break missingId;
      }

      id = R.id.planksPlayVideo;
      AppCompatButton planksPlayVideo = ViewBindings.findChildViewById(rootView, id);
      if (planksPlayVideo == null) {
        break missingId;
      }

      id = R.id.planksText;
      TextView planksText = ViewBindings.findChildViewById(rootView, id);
      if (planksText == null) {
        break missingId;
      }

      id = R.id.pushUpsLayout;
      ConstraintLayout pushUpsLayout = ViewBindings.findChildViewById(rootView, id);
      if (pushUpsLayout == null) {
        break missingId;
      }

      id = R.id.pushUpsPlayVideo;
      AppCompatButton pushUpsPlayVideo = ViewBindings.findChildViewById(rootView, id);
      if (pushUpsPlayVideo == null) {
        break missingId;
      }

      id = R.id.pushUpsText;
      TextView pushUpsText = ViewBindings.findChildViewById(rootView, id);
      if (pushUpsText == null) {
        break missingId;
      }

      id = R.id.squatsLayout;
      ConstraintLayout squatsLayout = ViewBindings.findChildViewById(rootView, id);
      if (squatsLayout == null) {
        break missingId;
      }

      id = R.id.squatsPlayVideo;
      AppCompatButton squatsPlayVideo = ViewBindings.findChildViewById(rootView, id);
      if (squatsPlayVideo == null) {
        break missingId;
      }

      id = R.id.squatsText;
      TextView squatsText = ViewBindings.findChildViewById(rootView, id);
      if (squatsText == null) {
        break missingId;
      }

      id = R.id.theVideoPlayer;
      YouTubePlayerView theVideoPlayer = ViewBindings.findChildViewById(rootView, id);
      if (theVideoPlayer == null) {
        break missingId;
      }

      id = R.id.volleyballHeader;
      TextView volleyballHeader = ViewBindings.findChildViewById(rootView, id);
      if (volleyballHeader == null) {
        break missingId;
      }

      return new VolleyballWorkoutsFragBinding((NestedScrollView) rootView, boxJumpsLayout,
          boxJumpsPlayVideo, boxJumpsText, enterFullScreenButton, fullScreenNotice,
          fullScreenViewContainer, highKneesLayout, highKneesPlayVideo, highKneesText,
          lateralShufflesLayout, lateralShufflesPlayVideo, lateralShufflesText, lungesLayout,
          lungesPlayVideo, lungesText, overHeadPressLayout, overHeadPressPlayVideo,
          overHeadPressText, planksLayout, planksPlayVideo, planksText, pushUpsLayout,
          pushUpsPlayVideo, pushUpsText, squatsLayout, squatsPlayVideo, squatsText, theVideoPlayer,
          volleyballHeader);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
