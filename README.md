# GenericRecyclerView

**Usage of GenericRecyclerView**

In order to import this library to your project, you need to follow these steps:

1)  Add jitpack to build.gradle - project level:
```css
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' } // at the bottom 
		}
	}
```
2) Add the dependency:
```css
dependencies {
	        implementation 'com.github.phatnm96:GenericRecyclerView:$version'
	}
```
# Sample code
- Create your ViewHolder class which extends GenericViewHolder

>     class YourViewHolder(binding: ItemBinding) :  
>             GenericViewHolder<Data, OnRecyclerItemClickListener>(binding.root) {  
>           
>           // Data is a object that you need pass to your 
>             override fun onBind(item: Data) {  
>                 item.let { binding.item = it }  
>           }  
>           
>             var binding: ItemBinding  
>           
>             init {  
>                 this.binding = binding  
>             } 
>         }

- Create your Adapter class which extends GenericAdapter<DataItem, OnRecyclerItemClickListener, YourVH, ItemBinding>

>     override fun getLayout(): Int {
>         return R.layout.item
>     }
> 
>     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YourViewHolder {
>         return YourViewHolder(inflate(parent) as ItemBinding)
>     }
- If you want to handle click event whenever user click on specific item, your Activity/Fragment need to implement OnRecyclerItemClickListener

## Note
You need to use data binding for this project :3
