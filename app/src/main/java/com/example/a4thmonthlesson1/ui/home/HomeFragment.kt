package com.example.a4thmonthlesson1.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController
import com.example.a4thmonthlesson1.R
import com.example.a4thmonthlesson1.ui.task.TaskFragment
import com.example.a4thmonthlesson1.databinding.FragmentHomeBinding
import com.example.a4thmonthlesson1.ui.task.Task
import com.example.a4thmonthlesson1.ui.home.adapter.TaskAdapter

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var adapter: TaskAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adapter = TaskAdapter()

    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fab.setOnClickListener {
            findNavController().navigate(R.id.taskFragment)
        }

        binding.recyclerView.adapter=adapter

        setFragmentResultListener(TaskFragment.FRAGMENT_RESULT) { key, bundle ->
            val task = bundle.getSerializable(TaskFragment.TASK_KEY) as Task
            adapter.addTask(task)
//            Log.e("ololo", "onViewCreated: " + bundle.getString("title"))
        }

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}