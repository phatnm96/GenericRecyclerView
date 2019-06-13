# GenericRecyclerView

Step 1: Add it in your root build.gradle at the end of repositories:

allprojects {
    repositories {
       maven { url 'https://jitpack.io' } // add at the bottom 
    }
}
  
Step 2: Add the dependency


repositories {
        implementation 'com.github.phatnm96:GenericRecyclerView:version'
}

Usage of GenericRecyclerView

STEP 1: Make your own adapter extend GenericRecyclerView

class ContactAdapter(context: Context) :
    GenericRecyclerView<Data, OnRecyclerItemClickListener, ContactViewHolder, ItemContactBinding>(
        context
    ) {
    
    override fun getLayout(): Int {
        return R.layout.item_contact
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        return ContactViewHolder(inflate(parent) as ItemContactBinding)
    }
}

STEP2 : Create viewholder extend ContactViewHolder:

class ContactViewHolder(binding: ItemContactBinding) :
    GenericViewHolder<Data, OnRecyclerItemClickListener>(binding.root) {

    override fun onBind(item: Data) {
        item.let { binding.item = it }
    }

    var binding: ItemContactBinding

    init {
        this.binding = binding
    }
}

STEP 3: Init your adapter and use it!

 ContactAdapter adapter = ContactAdapter(this)
                adapter.setItems(dummyData()) // set data to your adapter
                adapter.setListener(this) // register a OnRecyclerItemClickListener item lick event

Note: Your ViewHolder's XML layout must use databinding 
