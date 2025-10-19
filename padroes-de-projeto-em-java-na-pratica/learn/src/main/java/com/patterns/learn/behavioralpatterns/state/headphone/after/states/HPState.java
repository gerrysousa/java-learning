package com.patterns.learn.behavioralpatterns.state.headphone.after.states;

import com.patterns.learn.behavioralpatterns.state.headphone.after.HeadPhone;

public interface HPState {
	void click(HeadPhone hp);
	void longClick(HeadPhone hp);
}
