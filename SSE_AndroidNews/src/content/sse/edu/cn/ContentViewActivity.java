package content.sse.edu.cn;
import title.sse.edu.cn.R;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class ContentViewActivity extends ListActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);//�̳и��෽��
		setListAdapter(new ArrayAdapter<String>(this, R.layout.titles_sse,
				 NewsCon_sseActivity.GetNewsConList(3)));// ����Adapter������
		ListView contentUI = getListView();// ���ļ�xml�ļ�������ListView
		contentUI.setTextFilterEnabled(true);
	}
}