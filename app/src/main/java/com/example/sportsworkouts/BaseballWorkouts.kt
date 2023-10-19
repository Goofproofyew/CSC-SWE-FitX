package com.example.sportsworkouts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import com.example.sportsworkouts.databinding.BaseballWorkoutsFragBinding
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.FullscreenListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class BaseballWorkouts : Fragment() {

    //Variables for the youtube player
    private lateinit var youTubePlayerView: YouTubePlayerView
    private var youTubePlayer: YouTubePlayer? = null
    private var isFullscreen = false

    private var _binding: BaseballWorkoutsFragBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = BaseballWorkoutsFragBinding.inflate(inflater, container, false)
        return binding.root

    }

    //Function to change video
    private fun changeVideo(videoId: String, player: YouTubePlayerView){
        player.visibility = View.VISIBLE
        youTubePlayer?.loadVideo(videoId, 0F)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Initializing our youtube video player
        youTubePlayerView = view.findViewById(R.id.theVideoPlayer)
        lifecycle.addObserver(youTubePlayerView)

        //Fullscreen code
        val fullscreenViewContainer = view.findViewById<FrameLayout>(R.id.full_screen_view_container)
        youTubePlayerView.enableAutomaticInitialization = false
        youTubePlayerView.addFullscreenListener(object : FullscreenListener {
            override fun onEnterFullscreen(fullscreenView: View, exitFullscreen: () -> Unit) {
                isFullscreen = true

                // The video will continue playing in fullscreenView
                youTubePlayerView.visibility = View.GONE
                fullscreenViewContainer.visibility = View.VISIBLE
                fullscreenViewContainer.addView(fullscreenView)

                // Optionally request landscape orientation
                // requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
            }

            override fun onExitFullscreen() {
                isFullscreen = false

                // The video will continue playing in the player
                youTubePlayerView.visibility = View.VISIBLE
                fullscreenViewContainer.visibility = View.GONE
                fullscreenViewContainer.removeAllViews()
            }
        })
        //End Fullscreen code

        //Adding the youtube listener so we can change the video
        youTubePlayerView.addYouTubePlayerListener(object: AbstractYouTubePlayerListener(){
            override fun onReady(player: YouTubePlayer) {
                this@BaseballWorkouts.youTubePlayer = youTubePlayer
                youTubePlayer?.loadVideo("S0Q4gqBUs7c", 0f)

                val enterFullscreenButton = view.findViewById<Button>(R.id.enterFullScreenButton)
                enterFullscreenButton.setOnClickListener {
                    youTubePlayer?.toggleFullscreen()
                }
                youTubePlayer = player
            }
        })

        //For the following video startups, we send the youTubePlayerView to ensure the player becomes visible
        // TODO(See if there is a more effective way of doing it)

        //Code to start squats video
        val squatsYoutubeButton = view.findViewById<Button>(R.id.squatsPlayVideo)
        squatsYoutubeButton.setOnClickListener {
            //TODO(getVideo ID from database)
            changeVideo("iZTxa8NJH2g", youTubePlayerView)
        }

        //Code to start lunges video
        val lungesYoutubeButton = view.findViewById<Button>(R.id.lungesPlayVideo)
        lungesYoutubeButton.setOnClickListener {
            //TODO(getVideo ID from database)
            changeVideo("IEB8cd1BfQU", youTubePlayerView)
        }

        //Code to start dumbellRows video
        val dumbellRowsYoutubeButton = view.findViewById<Button>(R.id.dumbbellRowsPlayVideo)
        dumbellRowsYoutubeButton.setOnClickListener {
            //TODO(getVideo ID from database)
            changeVideo("SdTdLvlyapI", youTubePlayerView)
        }

        //Code to start pushups video
        val pushUpsYoutubeButton = view.findViewById<Button>(R.id.pushUpsPlayVideo)
        pushUpsYoutubeButton.setOnClickListener {
            //TODO(getVideo ID from database)
            changeVideo("y7PBQ2fYbxY", youTubePlayerView)
        }

        //Code to start militaryPress video
        val militaryPressYoutubeButton = view.findViewById<Button>(R.id.militaryPressPlayVideo)
        militaryPressYoutubeButton.setOnClickListener {
            //TODO(getVideo ID from database)
            changeVideo("R31URdOyYCg", youTubePlayerView)
        }

        //Code to start sideLatRaises video
        val sideLatRaisesYoutubeButton = view.findViewById<Button>(R.id.sideLatRaisesPlayVideo)
        sideLatRaisesYoutubeButton.setOnClickListener {
            //TODO(getVideo ID from database)
            changeVideo("qRKMx7FQyAo", youTubePlayerView)
        }

        //Code to start standingBicepCurls video
        val standingBicepCurlsYoutubeButton = view.findViewById<Button>(R.id.standingBicepCurlsPlayVideo)
        standingBicepCurlsYoutubeButton.setOnClickListener {
            //TODO(getVideo ID from database)
            changeVideo("2jpteC44QKg", youTubePlayerView)
        }

        //Code to start tricepKickbacks video
        val tricepKickbacksYoutubeButton = view.findViewById<Button>(R.id.tricepKickbacksPlayVideo)
        tricepKickbacksYoutubeButton.setOnClickListener {
            //TODO(getVideo ID from database)
            changeVideo("3Bv1n7-DN7c", youTubePlayerView)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        youTubePlayerView.release()
        _binding = null
    }
}