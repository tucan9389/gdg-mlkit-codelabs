package jeongari.com.lusmile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jeongari.com.camera.Camera2BasicFragment


class CameraFragment : Camera2BasicFragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup, savedInstanceState: Bundle?): View? {
        val view = inflateFragment(R.layout.fragment_camera, inflater, container)
        return view
    }

    companion object {

        fun newInstance() : CameraFragment {
            return CameraFragment()
        }
    }
}