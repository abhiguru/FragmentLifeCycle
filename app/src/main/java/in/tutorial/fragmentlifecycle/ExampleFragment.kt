package `in`.tutorial.fragmentlifecycle

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ExampleFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ExampleFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("onCreate", "Method is called ")
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("onCreateView", "Method is called ")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_example, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i("onViewCreated", "Method is called ")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Log.i("onViewStateRestored", "Method is called ")
        super.onViewStateRestored(savedInstanceState)
    }

    override fun onStart() {
        Log.i("onStart", "Method is called ")
        super.onStart()
    }

    override fun onResume() {
        Log.i("onResume", "Method is called ")
        super.onResume()
    }

    override fun onPause() {
        Log.i("onPause", "Method is called ")
        super.onPause()
    }

    override fun onStop() {
        Log.i("onPause", "Method is called ")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.i("onSaveInstance", "Method is called ")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        Log.i("onDestroyView", "Method is called ")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("onDestroy", "Method is called ")
        super.onDestroy()
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ExampleFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ExampleFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}