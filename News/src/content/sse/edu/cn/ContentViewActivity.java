package content.sse.edu.cn;

import title.sse.edu.cn.R;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ContentViewActivity extends ListActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this, R.layout.titles_sse,
				 NewsCon_sseActivity.GetNewsConList(3)));// ����Adapter������
		// System.out.println(NewsCon_sseActivity.GetNewsConList(0)[0]);
		ListView contentUI = getListView();// ���ļ�xml�ļ�������ListView
		contentUI.setTextFilterEnabled(true);
	}

//	public String[] GetContent(int titleId) {
//		String[] newContent = {""};// ������
//		String[] content = null;
//   
//		content = NewsCon_sseActivity.GetNewsConList(titleId);
//		System.out.println(content.length);
//		// �����ݣ��ܿ��ܰ���null
//		int counter = 0;// �Ǹ�����ʹ�ð�contentʵ����������newContent��
//		if (content.length == 0) {
//			newContent[0] = "���,��ȡ���ų�����!";
//		} else {
//			for (String str : content) {
//				if (!(str == null) || !(content[1].equals(""))) {// ����nullֵ
//					newContent[counter] = str;
//					counter++;
//				} else {
//					break;
//				}
//
//			}
//		}
//		System.out.println(newContent.length);
//		return newContent;
//	}
}