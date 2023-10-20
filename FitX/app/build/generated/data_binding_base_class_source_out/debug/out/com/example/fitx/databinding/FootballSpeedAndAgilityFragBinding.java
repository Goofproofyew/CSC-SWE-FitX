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

public final class FootballSpeedAndAgilityFragBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final ConstraintLayout agilityLadderLayout;

  @NonNull
  public final AppCompatButton agilityLadderPlayVideo;

  @NonNull
  public final TextView agilityLadderText;

  @NonNull
  public final AppCompatButton enterFullScreenButton;

  @NonNull
  public final TextView footballLowerBodyHeader;

  @NonNull
  public final TextView fullScreenNotice;

  @NonNull
  public final FrameLayout fullScreenViewContainer;

  @NonNull
  public final TextView jumpAndReachInfo;

  @NonNull
  public final ConstraintLayout jumpAndReachLayout;

  @NonNull
  public final AppCompatButton jumpAndReachPlayVideo;

  @NonNull
  public final TextView jumpAndReachText;

  @NonNull
  public final TextView sprint400mInfo;

  @NonNull
  public final ConstraintLayout sprint400mLayout;

  @NonNull
  public final AppCompatButton sprint400mPlayVideo;

  @NonNull
  public final TextView sprint400mText;

  @NonNull
  public final TextView sprints10mInfo;

  @NonNull
  public final ConstraintLayout sprints10mLayout;

  @NonNull
  public final AppCompatButton sprints10mPlayVideo;

  @NonNull
  public final TextView sprints10mText;

  @NonNull
  public final TextView sprints25mInfo;

  @NonNull
  public final ConstraintLayout sprints25mLayout;

  @NonNull
  public final AppCompatButton sprints25mPlayVideo;

  @NonNull
  public final TextView sprints25mText;

  @NonNull
  public final ConstraintLayout suicidesLayout;

  @NonNull
  public final AppCompatButton suicidesPlayVideo;

  @NonNull
  public final TextView suicidesText;

  @NonNull
  public final YouTubePlayerView theVideoPlayer;

  private FootballSpeedAndAgilityFragBinding(@NonNull NestedScrollView rootView,
      @NonNull ConstraintLayout agilityLadderLayout,
      @NonNull AppCompatButton agilityLadderPlayVideo, @NonNull TextView agilityLadderText,
      @NonNull AppCompatButton enterFullScreenButton, @NonNull TextView footballLowerBodyHeader,
      @NonNull TextView fullScreenNotice, @NonNull FrameLayout fullScreenViewContainer,
      @NonNull TextView jumpAndReachInfo, @NonNull ConstraintLayout jumpAndReachLayout,
      @NonNull AppCompatButton jumpAndReachPlayVideo, @NonNull TextView jumpAndReachText,
      @NonNull TextView sprint400mInfo, @NonNull ConstraintLayout sprint400mLayout,
      @NonNull AppCompatButton sprint400mPlayVideo, @NonNull TextView sprint400mText,
      @NonNull TextView sprints10mInfo, @NonNull ConstraintLayout sprints10mLayout,
      @NonNull AppCompatButton sprints10mPlayVideo, @NonNull TextView sprints10mText,
      @NonNull TextView sprints25mInfo, @NonNull ConstraintLayout sprints25mLayout,
      @NonNull AppCompatButton sprints25mPlayVideo, @NonNull TextView sprints25mText,
      @NonNull ConstraintLayout suicidesLayout, @NonNull AppCompatButton suicidesPlayVideo,
      @NonNull TextView suicidesText, @NonNull YouTubePlayerView theVideoPlayer) {
    this.rootView = rootView;
    this.agilityLadderLayout = agilityLadderLayout;
    this.agilityLadderPlayVideo = agilityLadderPlayVideo;
    this.agilityLadderText = agilityLadderText;
    this.enterFullScreenButton = enterFullScreenButton;
    this.footballLowerBodyHeader = footballLowerBodyHeader;
    this.fullScreenNotice = fullScreenNotice;
    this.fullScreenViewContainer = fullScreenViewContainer;
    this.jumpAndReachInfo = jumpAndReachInfo;
    this.jumpAndReachLayout = jumpAndReachLayout;
    this.jumpAndReachPlayVideo = jumpAndReachPlayVideo;
    this.jumpAndReachText = jumpAndReachText;
    this.sprint400mInfo = sprint400mInfo;
    this.sprint400mLayout = sprint400mLayout;
    this.sprint400mPlayVideo = sprint400mPlayVideo;
    this.sprint400mText = sprint400mText;
    this.sprints10mInfo = sprints10mInfo;
    this.sprints10mLayout = sprints10mLayout;
    this.sprints10mPlayVideo = sprints10mPlayVideo;
    this.sprints10mText = sprints10mText;
    this.sprints25mInfo = sprints25mInfo;
    this.sprints25mLayout = sprints25mLayout;
    this.sprints25mPlayVideo = sprints25mPlayVideo;
    this.sprints25mText = sprints25mText;
    this.suicidesLayout = suicidesLayout;
    this.suicidesPlayVideo = suicidesPlayVideo;
    this.suicidesText = suicidesText;
    this.theVideoPlayer = theVideoPlayer;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FootballSpeedAndAgilityFragBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FootballSpeedAndAgilityFragBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.football_speed_and_agility_frag, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FootballSpeedAndAgilityFragBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.agilityLadderLayout;
      ConstraintLayout agilityLadderLayout = ViewBindings.findChildViewById(rootView, id);
      if (agilityLadderLayout == null) {
        break missingId;
      }

      id = R.id.agilityLadderPlayVideo;
      AppCompatButton agilityLadderPlayVideo = ViewBindings.findChildViewById(rootView, id);
      if (agilityLadderPlayVideo == null) {
        break missingId;
      }

      id = R.id.agilityLadderText;
      TextView agilityLadderText = ViewBindings.findChildViewById(rootView, id);
      if (agilityLadderText == null) {
        break missingId;
      }

      id = R.id.enterFullScreenButton;
      AppCompatButton enterFullScreenButton = ViewBindings.findChildViewById(rootView, id);
      if (enterFullScreenButton == null) {
        break missingId;
      }

      id = R.id.footballLowerBodyHeader;
      TextView footballLowerBodyHeader = ViewBindings.findChildViewById(rootView, id);
      if (footballLowerBodyHeader == null) {
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

      id = R.id.jumpAndReachInfo;
      TextView jumpAndReachInfo = ViewBindings.findChildViewById(rootView, id);
      if (jumpAndReachInfo == null) {
        break missingId;
      }

      id = R.id.jumpAndReachLayout;
      ConstraintLayout jumpAndReachLayout = ViewBindings.findChildViewById(rootView, id);
      if (jumpAndReachLayout == null) {
        break missingId;
      }

      id = R.id.jumpAndReachPlayVideo;
      AppCompatButton jumpAndReachPlayVideo = ViewBindings.findChildViewById(rootView, id);
      if (jumpAndReachPlayVideo == null) {
        break missingId;
      }

      id = R.id.jumpAndReachText;
      TextView jumpAndReachText = ViewBindings.findChildViewById(rootView, id);
      if (jumpAndReachText == null) {
        break missingId;
      }

      id = R.id.sprint400mInfo;
      TextView sprint400mInfo = ViewBindings.findChildViewById(rootView, id);
      if (sprint400mInfo == null) {
        break missingId;
      }

      id = R.id.sprint400mLayout;
      ConstraintLayout sprint400mLayout = ViewBindings.findChildViewById(rootView, id);
      if (sprint400mLayout == null) {
        break missingId;
      }

      id = R.id.sprint400mPlayVideo;
      AppCompatButton sprint400mPlayVideo = ViewBindings.findChildViewById(rootView, id);
      if (sprint400mPlayVideo == null) {
        break missingId;
      }

      id = R.id.sprint400mText;
      TextView sprint400mText = ViewBindings.findChildViewById(rootView, id);
      if (sprint400mText == null) {
        break missingId;
      }

      id = R.id.sprints10mInfo;
      TextView sprints10mInfo = ViewBindings.findChildViewById(rootView, id);
      if (sprints10mInfo == null) {
        break missingId;
      }

      id = R.id.sprints10mLayout;
      ConstraintLayout sprints10mLayout = ViewBindings.findChildViewById(rootView, id);
      if (sprints10mLayout == null) {
        break missingId;
      }

      id = R.id.sprints10mPlayVideo;
      AppCompatButton sprints10mPlayVideo = ViewBindings.findChildViewById(rootView, id);
      if (sprints10mPlayVideo == null) {
        break missingId;
      }

      id = R.id.sprints10mText;
      TextView sprints10mText = ViewBindings.findChildViewById(rootView, id);
      if (sprints10mText == null) {
        break missingId;
      }

      id = R.id.sprints25mInfo;
      TextView sprints25mInfo = ViewBindings.findChildViewById(rootView, id);
      if (sprints25mInfo == null) {
        break missingId;
      }

      id = R.id.sprints25mLayout;
      ConstraintLayout sprints25mLayout = ViewBindings.findChildViewById(rootView, id);
      if (sprints25mLayout == null) {
        break missingId;
      }

      id = R.id.sprints25mPlayVideo;
      AppCompatButton sprints25mPlayVideo = ViewBindings.findChildViewById(rootView, id);
      if (sprints25mPlayVideo == null) {
        break missingId;
      }

      id = R.id.sprints25mText;
      TextView sprints25mText = ViewBindings.findChildViewById(rootView, id);
      if (sprints25mText == null) {
        break missingId;
      }

      id = R.id.suicidesLayout;
      ConstraintLayout suicidesLayout = ViewBindings.findChildViewById(rootView, id);
      if (suicidesLayout == null) {
        break missingId;
      }

      id = R.id.suicidesPlayVideo;
      AppCompatButton suicidesPlayVideo = ViewBindings.findChildViewById(rootView, id);
      if (suicidesPlayVideo == null) {
        break missingId;
      }

      id = R.id.suicidesText;
      TextView suicidesText = ViewBindings.findChildViewById(rootView, id);
      if (suicidesText == null) {
        break missingId;
      }

      id = R.id.theVideoPlayer;
      YouTubePlayerView theVideoPlayer = ViewBindings.findChildViewById(rootView, id);
      if (theVideoPlayer == null) {
        break missingId;
      }

      return new FootballSpeedAndAgilityFragBinding((NestedScrollView) rootView,
          agilityLadderLayout, agilityLadderPlayVideo, agilityLadderText, enterFullScreenButton,
          footballLowerBodyHeader, fullScreenNotice, fullScreenViewContainer, jumpAndReachInfo,
          jumpAndReachLayout, jumpAndReachPlayVideo, jumpAndReachText, sprint400mInfo,
          sprint400mLayout, sprint400mPlayVideo, sprint400mText, sprints10mInfo, sprints10mLayout,
          sprints10mPlayVideo, sprints10mText, sprints25mInfo, sprints25mLayout,
          sprints25mPlayVideo, sprints25mText, suicidesLayout, suicidesPlayVideo, suicidesText,
          theVideoPlayer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}